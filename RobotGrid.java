public class RobotGrid {
    // Placeholder code for the main implementation class

    public boolean isSafe(int x, int y) {
        String allDigits = String.valueOf(Math.abs(x)) + String.valueOf(Math.abs(y));
        int sum = 0;

        for (int i = 0; i < allDigits.length(); i++) {
            String c = "" + allDigits.charAt(i);
            sum = sum + Integer.valueOf(c);
        }

        return sum > 23 ? false : true;
    }

    public int totalSafeSquares() {
        // TODO: Add implementation logic here
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int shortestSafeJourney(int a, int b, int x, int y) {
        // TODO: Add implementation logic here
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
