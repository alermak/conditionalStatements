public class Main {

    public static void main(String[] args) {
        int clientOs = 1;
        var clientDeviceYear = 2016;
        boolean oldVersionAn = clientOs > 0 && clientDeviceYear < 2015;
        boolean oldVersionIos = clientOs < 1 && clientDeviceYear < 2015;
        boolean newVersionAn = clientOs > 0 && clientDeviceYear >= 2015;
        boolean newVersionIos = clientOs < 1 && clientDeviceYear >= 2015;

        if (oldVersionAn) {
            System.out.println("Install the lite version of the Android app from the link.");
        }
        if (oldVersionIos) {
            System.out.println("Install the lite version of the iOS app from the link.");
        }
        if (newVersionAn) {
            System.out.println("Install the Android version of the app from the link.");
        }
        if (newVersionIos) {
            System.out.println("Install the iOS version of the app from the link");
        }

        int year = 2019;
        boolean isYearLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isYearLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        var deliveryDistance = 145;
        boolean oneDayDelivery = deliveryDistance <= 20;
        boolean twoDayDelivery = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean threeDayDelivery = deliveryDistance > 60 && deliveryDistance <= 100;
        if (oneDayDelivery) {
            System.out.println("Delivery will require 1 day");
        }
        if (twoDayDelivery) {
            System.out.println("Delivery will require 2 day");
        }
        if (threeDayDelivery) {
            System.out.println("Delivery will require 3 day");
        }
        if (deliveryDistance > 100) {
            System.out.println("Specify the delivery time with the manager.");
        }

        int monthNumber = 5;
        boolean isWinter = ((monthNumber > 0) && (monthNumber <= 2) || (monthNumber == 12));
        boolean isSpring = (monthNumber >= 3) && (monthNumber < 6);
        boolean isSummer = (monthNumber >= 6) && (monthNumber < 9);
        boolean isAutumn = (monthNumber >= 9) && (monthNumber < 12);
        boolean monthIncorrect = monthNumber > 12;

        if (isWinter) {
            System.out.println("Today is winter.");
        } else if (isSpring) {
            System.out.println("Today is spring.");
        } else if (isSummer) {
            System.out.println("Today is summer.");
        } else if (isAutumn) {
            System.out.println("Today is autumn.");
        } else if (monthIncorrect) {
            System.out.println("Month entered incorrectly.");

        }

    }


}