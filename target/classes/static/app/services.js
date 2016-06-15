'use strict';

app.factory('Stream', ['$resource', function ($resource) {
    
    return $resource('http://localhost:8080/eyecatcher/streams', {}, {
        'query': {method: 'GET', isArray: false }
    });

}]);

app.factory('Objects', ['$resource', function ($resource) {

    return $resource('http://api.leadspotting.com/eyecatcher/objects', {}, {
        'query': {method: 'GET', isArray: true }
    });
    
}]);
