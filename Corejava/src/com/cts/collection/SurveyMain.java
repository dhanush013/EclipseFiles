package com.cts.collection;

public class SurveyMain {
	
	public static void main(String[] args) {
		Survey survey1=new Survey();
		Survey survey2=new Survey();
		Survey survey3=new Survey();
		
		survey1.setSurveyId(1001);
		survey1.setSurveyName("Student Survey");
		survey1.setSurveyLocation("Chennai");
		
		survey2.setSurveyId(1002);
		survey2.setSurveyName("Education Survey");
		survey2.setSurveyLocation("Madurai");
		
		survey3.setSurveyId(1003);
		survey3.setSurveyName("Population Survey");
		survey3.setSurveyLocation("Ooty");
		
		SurveyOperation operation=new SurveyOperation();
		
		System.out.println(operation.addSurvey(survey1));
		System.out.println(operation.addSurvey(survey2));
		System.out.println(operation.addSurvey(survey3));
		System.out.println(operation.addSurvey(survey1));
		
		System.out.println(operation.getAllSurvey().size());
		
		System.out.println("All Survey List");
		
		for(Survey survey:operation.getAllSurvey()) {
			System.out.println(survey.getSurveyId()+" "+survey.getSurveyName()+" "+survey.getSurveyLocation());
			
		}
		
		System.out.println("Search Survey1");
		
		Survey survey_1=operation.searchSurvey(survey1);
		if(survey_1!=null) {
			System.out.println("Found ");
			System.out.println(survey_1.getSurveyId()+" "+survey_1.getSurveyName()+" "+survey_1.getSurveyLocation());
			
		}
		
		
	}

}
