angular.module('myModule', [])
.controller('myController', function ($scope) {

    $scope.message = "Hello";

    $scope.products = [
        {
            name: "eggs",
            unitPrice: 3.50,
            stockLevel: 42
        },
        {
            name: "milk",
            unitPrice: 2.25,
            stockLevel: 17
        },
        {
            name: "steak",
            unitPrice: 9.99,
            stockLevel: 8
        }
    ];

});