angular.module('myModule', [])
    .controller('myController', function ($scope, $http) {

        $scope.message = "Hello";
        $scope.currentProduct = null;

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

        $scope.products.selectProduct = function (product) {
            $scope.currentProduct = product;
        }

        $scope.doClick = function (product) {
            alert(product.name);
        }
        
        $scope.cells = [1,2,3,4,5,6,7,8,9,10];
        $scope.timesRun = 0;
        $scope.firstNumber = null;

        $scope.cells.selectNumber = function (number) {
            if ($scope.timesRun == 0){
                $scope.firstNumber = number;
                $scope.timesRun++;
                return false;
            }
            
            if ($scope.timesRun == 1){
                alert($scope.firstNumber * number);
                $scope.timesRun = 0;
                return false;
            }

        }

        $scope.customers = null;
        $scope.fetching = null;

        $scope.getCustomers = function () {
            console.log("Running getCustomers")
            $scope.fetching = 1;
            $http({
                method: "Get", url: "http://localhost:5000/customers"
            }).then(function (response) {
                $scope.customers = response.data;
            }, function (reason) {
                $scope.error = "Unable to get the data";
                console.log(reason.status + "," + reason.statusText);
            });
            $scope.fetching = null;
        }
        

    });