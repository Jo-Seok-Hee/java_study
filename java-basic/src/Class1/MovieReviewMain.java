package Class1;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview review1 = new MovieReview();
        review1.title = "인셉션";
        review1.review = "오 놀라워요~";

        MovieReview review2 = new MovieReview();
        review2.title = "괴물";
        review2.review = "눈물나요";

        MovieReview[] reviews = {review1, review2};
        for (int i = 0; i <reviews.length; i++) {

            System.out.println(reviews[i].title+"=="+reviews[i].review);
        }
    }
}
