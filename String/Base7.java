class Base7 {
    public String convertToBase7(int num) {
        // Edge Case
        if(num == 0) return "0";

        boolean isNegative = (num < 0);

        // Convert -Ve into +ve
        num = Math.abs(num);

        // Use StrinBuilder to perform tast and store res
        StringBuilder sb = new StringBuilder();

        while(num > 0) {
            int rem = num % 7;
            sb.append(rem); 
            num = num / 7;
        }

        // reverse val to get res
        sb.reverse();

        // If -ve val occur add " - " from front
        if(isNegative) {
            sb.insert(0 , "-");
        }

        return sb.toString();
    }
}