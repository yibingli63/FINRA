
	myApp.controller ('myCtrl',function ($scope, $filter, mySvc) {

	$scope.alphaNumericList =[];
	$scope.phone_number = '';
		
	$scope.addPhoneNumber = function(){
	       var p_num = $scope.phone_number
	       console.log(p_num);
	       if ((typeof(p_num) === "undefined") && (p_num == null)){
	    	   console.log("Null !!!");
	       } else {   
	         mySvc.addPhoneNumber(p_num).then(
	    	 function successCallback(response){ 
	    		$scope.alphaNumericList = response.data;
        		$scope.totalItems = $scope.alphaNumericList.length;  
	       	 });
	       }
	    }

	  $scope.currentPage = 1;
      $scope.numPerPage = 10;  
      
      $scope.order = function (predicate) {  
          $scope.reverse = ($scope.predicate === predicate) ? !$scope.reverse : false;  
          $scope.predicate = predicate;  
        };  
      
      $scope.paginate = function (value) {  
        var begin, end, index;  
        begin = ($scope.currentPage - 1) * $scope.numPerPage;  
        end = begin + $scope.numPerPage;  
        index = $scope.alphaNumericList.indexOf(value);  
        return (begin <= index && index < end);  
      }
	
	})    
    
