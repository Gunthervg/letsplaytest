var module = angular.module('hello', []);

module.controller('SearchCollectionController', function ($scope, $http) {

    $scope.searchcollection = function () {
        $http.get('/search').success(function (data, status, headers, config) {
            $scope.Details = data;
        })
            .error(function (data, status, header, config) {
                $scope.ResponseDetails = "Data: " + data +
                    "<br />status: " + status +
                    "<br />headers: " + jsonFilter(header) +
                    "<br />config: " + jsonFilter(config);
            });
    };

    //$scope.searchcollection = function () {
    //    $http({
    //        method: 'POST',
    //        url: '/search',
    //        data: "username=" + $scope.username,
    //        headers: {'Content-Type': 'application/x-www-form-urlencoded'}
    //    })
    //};
});

