
var app = angular.module('myApp', []);

// table as angular
app.controller('apictrl', function($scope, $http) {
    $http.get("api/member").then(function(response) {
        $scope.members = response.data;
        $scope.heads = Object.keys($scope.members[1]);
        
        /*
        for(var i = 0; i <$scope.members.length; i++)
        {
        $scope.members2 = $scope.members[i];
        } */
    }); 
});


function filltable()
{
                $.getJSON("api/member", function (data) {
                    
                    $('#jquerytable').append("<tr><td><h3> ID </h3></td>  <td><h3> age </h3></td>  <td><h3> eyeColor </h3></td> " +
                            "<td><h3> name </h3></td>  <td><h3> email </h3></td>  <td><h3> friends </h3></td> </tr>");
                    $.each(data, function (key, val) {

var friends = "";
           friends = "";
            for (var i = 0; i < val.friends.length; i++) {
              friends = friends + "<li>" + val.friends[i].name.toString() + "</li> " ;  
            }
                      

                        $('<tr><td>' + val.id + "</td> <td> " + val.age + '</td>' + '<td>'  + val.eyeColor +
                        '</td>' + '<td>'  + val.name + '</td>' + '<td>'  + val.email + '</td>' + '<td><ul>'  + friends +
                        '</ul></td>' + '</tr>').appendTo($("#jquerytable"));
                    });
                }); // gets json from the api api/person/contactinfo and processes it to show.
               
               };
