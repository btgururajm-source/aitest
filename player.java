public class player implements Cricket, Badminton {

    @Override
    public void bat(int runs) {
        System.out.println("Scored " + runs + " runs");
    }

    @Override
    public void bowl(int overs) {
        System.out.println("Bowled " + overs + " overs");
    }

    @Override
    public void field(String position) {
        System.out.println("Fielding at " + position);
    }

    @Override
    public void serve(String serveType) {
        System.out.println("Serve type: " + serveType);
    }

    @Override
    public void smash(int speed) {
        System.out.println("Smash speed: " + speed + " km/h");
    }

    @Override
    public void rally(int durationInSeconds) {
        System.out.println("Rally duration: " + durationInSeconds + " seconds");
    }
}
