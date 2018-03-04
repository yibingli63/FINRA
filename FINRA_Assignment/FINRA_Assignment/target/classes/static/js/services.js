myApp.factory('mySvc', function($http) {
	return {		 
	   	 addPhoneNumber: addPhoneNumber		
	 };  
	 
	 function addPhoneNumber(p_num){
		 return $http.get('/PrintStrings', {
             params: {"phoneNumber":p_num}
		 });
	 }
	 
  });
