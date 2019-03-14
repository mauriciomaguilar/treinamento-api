var api_key_ts_hash = 'apikey=d179a68123c002407553b99139d00ecd&ts=1552354601050&hash=5ed4bbd16b6449101a53bcf87eddf66a'
var api_character = 'http://gateway.marvel.com/v1/public/characters?' + api_key_ts_hash;
var api_comics = 'http://gateway.marvel.com/v1/public/comics?' + api_key_ts_hash;

angular.module('tabelaEstagio').service('characterService', function ($http) {

    var CallbackRequest = function (callback, response) {
        closeLoading();
        var body = response.data;
        if (!body || (body && !body.success)) {
            callback(null, response.status, body);
        } else {
            callback(body.data, response.status, body);
        }
    };

    this.findAllCharacters = function (callback) {
        getLoading();
        $http.get(api_character + '&limit=100')
            .then(CallbackRequest.bind(this, callback),
                CallbackRequest.bind(this, callback));
    };

    this.findCharacterByName = function (nome, callback) {
        getLoading();
        if (nome) {
            $http.get(api_character + '&limit=100' + '&nameStartsWith=' + nome)
                .then(CallbackRequest.bind(this, callback),
                    CallbackRequest.bind(this, callback));
        } else {
            this.findAllCharacters(callback);
        }
    }

});

angular.module('tabelaEstagio').service('comicService', function ($http) {

    var CallbackRequest = function (callback, response) {
        closeLoading();
        var body = response.data;
        if (!body || (body && !body.success)) {
            callback(null, response.status, body);
        } else {
            callback(body.data, response.status, body);
        }
    };

    this.findAllComics = function (callback) {
        getLoading();
        $http.get(api_comics + '&limit=100')
            .then(CallbackRequest.bind(this, callback),
                CallbackRequest.bind(this, callback));
    };

    this.findComicByName = function (nome, callback) {
        getLoading();
        if (nome) {
            $http.get(api_comics + '&limit=100' + '&titleStartsWith=' + nome)
                .then(CallbackRequest.bind(this, callback),
                    CallbackRequest.bind(this, callback));
        } else {
            this.findAllComics(callback);
        }
    }

});