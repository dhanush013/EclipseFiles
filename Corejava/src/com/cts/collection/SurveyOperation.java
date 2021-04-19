package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class SurveyOperation {
	
	List<Survey> surveylist;
	
	public SurveyOperation() {
		surveylist=new ArrayList<Survey>();
	}
	
	public boolean addSurvey(Survey survey) {
		if(searchSurvey(survey)==null) {
			surveylist.add(survey);
			return true;
		}
		
		return false;
	}
	
	public Survey searchSurvey(Survey survey) {
		if(surveylist.contains(survey))
			return survey;
		else 
			return null;
	}
	
	public List<Survey> getAllSurvey(){
		return surveylist;
	}

}
