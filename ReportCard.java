public class ReportCard{

private String mSubjectTaken;

private String mGradeGiven;

public ReportCard(String subjectTaken, String gradeGiven){

mSubjectTaken = subjectTaken;

mGradegiven = gradeGiven;
}

/**
*Get the subject of a course.
*/
public String getSubjectTaken(){
return mSubjectTaken;
}

/**
*Get the grade given to a student for a subject.
*/

public String getGradeGiven(){
return mGradeGiven;
}

public String toString(){
return ReportCard;
}

}
