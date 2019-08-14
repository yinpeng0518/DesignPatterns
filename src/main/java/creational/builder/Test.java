package creational.builder;



public class Test {

    public static void main(String[] args) {
        Course course=new Course.Builder()
                .builderCourseName("Java设计模式精讲")
                .builderCoursePPT("Java设计模式精讲PPT")
                .builderCourseVideo("Java设计模式精讲视频")
                .builderCourseArticle("Java设计模式精讲手记")
                .builderCourseQA("Java设计模式精讲问答")
                .build();
        System.out.println(course);
    }
}
