package model;

/**
 * Paradigm of Singleton class
 * Creates an instance of SaintGeorgeKnight with a single
 * method: embarkOnMission.
 */
public class SaintGeorgeKnight {
    private static SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight(){};

    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission(){
        System.out.println("Embarking on mission!");
    }
}
