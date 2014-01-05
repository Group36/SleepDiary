// 'linker' is used to go forward a question.  

function linker(completionSignal,link,finishKey){
	    	//The completionSignal is the score
			checker=localStorage.getItem(completionSignal);
	    	if(checker=='50'||checker=='0'||checker=='10'||checker=='20'||checker=='30'||checker=='40'){
	    	/*The 'finish' result is the number of the next question. Should the user suddenly leave
	    	* the app, this result will open up the same question from the menu screen when they return,
	    	* (if they return on the same day, that is). 
	    	*/	
	    	localStorage.setItem('finish',finishKey);
	    	window.location.href=link;
	    	
	    	
	    	}
	    	else if(localStorage.getItem(finishKey)!='warned'){
	    		document.getElementById("warning2").innerHTML +='Please Select an Answer!<br>';
	    		localStorage.setItem(finishKey,'warned');}
	    	}

function linkBack(link, finishKey){
		/*This function goes back through pages, the user does not have to complete the question for
		*this to work unlike the linker function*/
		localStorage.setItem('finish',finishKey);
    	window.location.href=link;
}

function handler(rBName, scoreAddress, score, answerKey, answer) {
	/*The handler function is the action listener for the radio buttons in the first 8 questions.
	* It ensures only one radiobutton is checked at a time, it also stores the score and the answer*/
	var ex3 = document.getElementById(rBName);
	ex3.checked=false;
	localStorage.setItem( scoreAddress, score);
	var dayAddress=localStorage.getItem('todaysCount');
	localStorage.setItem(dayAddress+answerKey,answer);
}

function tipsCalculator(){
	// The tips are calculated based on the first 8 questions which monitor sleep hygiene.
	
	var todaysCount=parseInt(localStorage.getItem('todaysCount'));
	scoreTotals = new Array(8);
		
	var question;
	var k;
	
	/*Here is a nested for-loop which adds up the scores for each question over the most recent
	 * 14 days and puts the total into the array 'scoreTotals'.
	 */
	
	for(question=1; question<9;question++ ){
	var answerTotal=0;
	for (k=todaysCount-1; k>todaysCount-15;k--){
		
		var ReadAnswer=localStorage.getItem(k+'-'+question)+'1';
		if(ReadAnswer!='null1'){
			/*If a user skips a question it's entry for that day of 'null' will not be included
			in the calculation*/
		answerTotal+=parseInt((localStorage.getItem(k+'-'+question)));}
		}
		scoreTotals[question-1]=answerTotal;
	}
	
	/*The numbers assigned to the answers are such that, the worse the answer is, the higher the score.
	For an example, if you smoked before bed, it's a 1, otherwise you score 0.  The next part calculates
	which indices of the array have the 4 highest scores*/
	
	var counter1=0; var max1=scoreTotals[0];max1Ind=0;
	while(++counter1<scoreTotals.length){
		if(scoreTotals[counter1]>max1){
			max1Ind=counter1;
			max1=scoreTotals[counter1];}}
	/*At the end of this while-loop, the final max1Ind value will be the index of the array element
	with the highest value*/
	
	/*The following while loop then calculates the second highest value, and it's corresponding index in
	 * the array.
	 */
	
	var counter2=0; var max2=scoreTotals[0];max2Ind=0;
	while(++counter2<scoreTotals.length){
		//The if-loop skips the index of the highest value, max1Ind.
		if(scoreTotals[counter2]>max2&&scoreTotals[counter2]<=max1&&counter2!=max1Ind){
			max2Ind=counter2;
			max2=scoreTotals[counter2];}
		}		
	
	//While-loop for the 3rd highest value:
	
	var counter3=0; var max3=scoreTotals[0];max3Ind=0;
	while(++counter3<scoreTotals.length){
		//The if-loop skips the indices of the two highest values, max2Ind and max1Ind.
		if(scoreTotals[counter3]>max3&&scoreTotals[counter3]<=max2&&counter3!=max2Ind&&counter3!=max1Ind){
			max3Ind=counter3;
			max3=scoreTotals[counter3];}
		}
	
	//While-loop for the 4th highest value:
		
	var counter4=0; var max4=scoreTotals[0];max4Ind=0;
	while(++counter4<scoreTotals.length){
		if(scoreTotals[counter4]>max4&&scoreTotals[counter4]<=max3&&counter4!=max3Ind&&counter4!=max2Ind&&counter4!=max1Ind){
			max4Ind=counter4;
			max4=scoreTotals[counter4];}
		}
	
	/*The function tipSwitcher then turns the index numbers of the top 4 scores into corresponding tips.
	The order of the tips matches the order of the scores, so that the most problematic areas appear
	at the top of the tips page.*/
	
	
	tipSwitcher(max1Ind,1);
	tipSwitcher(max2Ind,2);
	tipSwitcher(max3Ind,3);
	tipSwitcher(max4Ind,4);
	//Finally the tipcount is bumped up by one.
	var newTipCount=parseInt(localStorage.getItem('tipCount'))+1;
	localStorage.setItem('tipCount',newTipCount);
	}
	
	function tipSwitcher(index, tipNo){
		switch(index){
		case 0:localStorage.setItem('tips'+tipNo,'Try not to drink caffeine before bed!');
		break;
		case 1:localStorage.setItem('tips'+tipNo,'Avoid alcohol before bed!');
		break;
		case 2:localStorage.setItem('tips'+tipNo,'No smoking near bedtime, if you can.');
		break;
		case 3:localStorage.setItem('tips'+tipNo,'Take more time to chill out before bed!');
		break;
		case 4:localStorage.setItem('tips'+tipNo,'Avoid using sleeping pills, if you can.');
		break;
		case 5:localStorage.setItem('tips'+tipNo,'Try to make your sleeping environment more comfortable!');
		break;
		case 6:localStorage.setItem('tips'+tipNo,'Please try to go to bed at roughly the same time each night.');
		break;
		case 7:localStorage.setItem('tips'+tipNo,'Please try to get up at roughly the same time each day.');
		break;}
	
}