package creational.builder;

/**
 * 建造者模式
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    private Course(Builder builder){
        this.courseName=builder.courseName;
        this.coursePPT=builder.coursePPT;
        this.courseArticle=builder.courseArticle;
        this.courseQA=builder.courseQA;
        this.courseVideo=builder.courseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class Builder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public  Builder builderCourseName(String courseName){
            this.courseName=courseName;
            return this;
        }

        public  Builder builderCoursePPT(String coursePPT){
            this.coursePPT=coursePPT;
            return this;
        }
        public  Builder builderCourseVideo(String courseVideo){
            this.courseVideo=courseVideo;
            return this;
        }
        public  Builder builderCourseArticle(String courseArticle){
            this.courseArticle=courseArticle;
            return this;
        }
        public  Builder builderCourseQA(String courseQA){
            this.courseQA=courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
