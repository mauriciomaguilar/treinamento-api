angular.module('tabelaEstagio').controller('characterController', function ($scope, characterService) {

    $scope.form = [];

    $scope.findAllCharacters = function () {
        characterService.findAllCharacters(function (erro, status, body) {
            $scope.lista = body.data.results;
        });
    };

    $scope.findCharacterByName = function () {
        characterService.findCharacterByName($scope.form.buscaNome, function (erro, status, body) {
            $scope.lista = body.data ? body.data.results : [];
        });
    }

});

angular.module('tabelaEstagio').controller('comicController', function ($scope, comicService) {

    $scope.form = [];

    $scope.findAllComics = function () {
        comicService.findAllComics(function (erro, status, body) {
            $scope.lista = body.data.results;
        });
    };

    $scope.findComicByName = function () {
        comicService.findComicByName($scope.form.buscaTitulo, function (erro, status, body) {
            $scope.lista = body.data ? body.data.results : [];
        });
    }
});