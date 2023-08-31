package oop.exceptions;

public class Bag {

    private final int maxShakeTime;

    public Bag(int maxShakeTime) {
        this.maxShakeTime = maxShakeTime;
    }

    public void putValue(String value) {
        if (value.equals("BAD_ITEM")) {
            throw new BadItemException("Bat items cannot be put in bag");
        }
        // ....
    }

    public void shakeItems(int times) {
        if (times > maxShakeTime) {
            throw new ShakeException("Shake cannot be more than " + maxShakeTime);
        }
        // ....
    }

    public void putMoreWeight(double weight) throws NoMetterWhatException {
        if (weight > 600) {
            throw new NoMetterWhatException("It sould not more that 600.");
        }
        //.. actual code
    }

    public void putMoreWeightHandled(double weight) {
        try {
            putMoreWeight(weight);
        } catch (NoMetterWhatException e) {
            throw new BagException(e.getMessage());
        }
    }
}
