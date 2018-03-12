
app.service('ReadServices', function($scope, $http) {
    this.GetFromServer(Param)= function() {
        
        $http.get("/"+Param).then(function (response) {
        $scope.myWelcome = response.data;
    });
    }
});

