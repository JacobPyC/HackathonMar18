package controllers;

import play.libs.Json;
import play.mvc.*;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

import DAL.*;
import models.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

   public surviversDAL useSurviversDAL = new surviversDAL();
   public itemDAL useItemDAL = new itemDAL();
   public donersDAL useDonersDAL = new donersDAL();
   
   public Result getList() {
	   return ok(Json.toJson(useItemDAL.getAll()));
   }
   
   public Result addItem() {
	   
	   JsonNode data = request().body().asJson();
	   
	   String item = data.findValue("Item").asText();
	   String UserName_Surviver = data.findValue("UserName_Surviver").asText();
	   Date a = new Date();
	   
	   item itemToAdd = new item(item, UserName_Surviver, null, a, false);
	   useItemDAL.add(itemToAdd);

	   return ok();
   }
   
   
   
    public Result addSurvivers() {
    	
    	JsonNode data = request().body().asJson();
    	
    	String userName = data.findValue("username").asText();
    	String psd = data.findValue("Pasword").asText();
    	String Phone = data.findValue("Phone").asText();
    	String Addres = data.findValue("Addres").asText();
    	
    	survivers currDurvivers = new survivers(userName, psd, Phone, Addres);
    	
    	useSurviversDAL.addUser(currDurvivers);
        return ok();
    }
    
  public Result addDoners() {
    	
    	JsonNode data = request().body().asJson();
    	
    	String userName = data.findValue("username").asText();
    	String psd = data.findValue("Pasword").asText();
    	String Phone = data.findValue("Phone").asText();
    	String Addres = data.findValue("Addres").asText();
    	
    	doners currDurvivers = new doners(userName, psd, Phone, Addres);
    	
    	useDonersDAL.addUser(currDurvivers);
        return ok();
    }
  
  public Result isSurvivExis(String name, String psd) {
	  if (useSurviversDAL.isExists(name, psd)) {
		  return ok();
	  } else {
		  return badRequest();
	  }  
  }
  
  public Result isDonersExis(String name, String psd) {
	  if (useDonersDAL.isExists(name, psd)) {
		  return ok();
	  } else {
		  return badRequest();
	  } 
  }
 
  public  Result getScore() {
	  
  }
}
