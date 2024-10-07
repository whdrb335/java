package java_basic.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview[] mReview = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        mReview[0] = inception;
        
        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        mReview[1] = aboutTime;

        for (MovieReview movieReview : mReview) {
            System.out.println("영화 제목 : " + movieReview.title + ", 리뷰 : " + movieReview.review );
        }
    }
}
