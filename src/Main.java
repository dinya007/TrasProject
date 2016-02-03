import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private Map<Integer, MElement> mcuMap = new HashMap<>();
    private Map<Integer, MElement> memMap = new HashMap<>();
    private List<Connection> connections = new ArrayList<>();
    private List<Polygon> polygons = new ArrayList<>();
    private List<JumpPoint> jumpPoints = new ArrayList<>();


    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        readCoordinates("coordinates.csv");
        readConncetions("connect.csv");


        for (int i = 0; i < 1; i++) {
            MElement mcu = mcuMap.get(connections.get(i).getMcuId());
            MElement mem = memMap.get(connections.get(i).getMemId());

            Double mcuX = mcu.getPoint().getX();
            Double mcuY = mcu.getPoint().getY();

            Double memX = mem.getPoint().getX();
            Double memY = mem.getPoint().getY();

//            Point midlePoint =
        }



    }


    private void readCoordinates(String fileName) {
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] element = line.split(cvsSplitBy);

                if (Integer.valueOf(element[1]) == 1) {
                    MCU mcu = new MCU(Integer.valueOf(element[0]), Double.valueOf(element[2].replace(',','.')), Double.valueOf(element[3].replace(',','.')));
                    mcuMap.put(mcu.getId(), mcu);
                } else {
                    MEM mem = new MEM(Integer.valueOf(element[0]), Double.valueOf(element[2].replace(',','.')), Double.valueOf(element[3].replace(',','.')));
                    memMap.put(mem.getId(), mem);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void readConncetions(String fileName) {
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] element = line.split(cvsSplitBy);
                connections.add(new Connection(Integer.valueOf(element[0]), Integer.valueOf(element[1])));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
