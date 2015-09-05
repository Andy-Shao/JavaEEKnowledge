package aphorism2;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Adages {
    private static CopyOnWriteArrayList<Adage> adages;
    private static AtomicInteger id;

    static {
        String[] aphorisms =
            {
                "What can be shown cannot be said." , "If a lion could talk, we could not understand him." ,
                "Philosophy is a battle against the bewitchment of our intelligence by means of language." ,
                "Ambition is the death of thought." , "The limits of my language mean the limits of my world."
            };
        Adages.adages = new CopyOnWriteArrayList<Adage>();
        Adages.id = new AtomicInteger();
        for (String str : aphorisms)
            Adages.add(str);
    }

    // Support POST operation.
    public static void add(String words) {
        int localId = Adages.id.incrementAndGet();
        Adage adage = new Adage();
        adage.setWords(words);
        adage.setId(localId);
        Adages.adages.add(adage);
    }

    // Support GET one operation.
    public static Adage find(int id) {
        Adage adage = null;
        for (Adage a : Adages.adages)
            if (a.getId() == id) {
                adage = a;
                break;
            }
        return adage;
    }

    public static CopyOnWriteArrayList<Adage> getList() {
        return Adages.adages;
    }

    public static String toPlain() {
        String retval = "";
        @SuppressWarnings("unused")
        int i = 1;
        for (Adage adage : Adages.adages)
            retval += adage.toString() + "\n";
        return retval;
    }
}
