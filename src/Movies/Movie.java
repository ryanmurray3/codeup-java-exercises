package Movies;

public class Movie {
        private String name;

        private String category;

        public Movie(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public void setName(String name) {
            this.name = name;
    }
}
