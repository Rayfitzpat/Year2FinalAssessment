import java.util.Scanner;

public class ElectionStat implements Comparable<ElectionStat> {

    private String id;
    private String surName;
    private String firstName;
    private String address;
    private String party;
    private String area;

    public ElectionStat(String line) {

        try {
            Scanner sc = new Scanner(line);
            while(sc.hasNextLine()) {
                line = sc.nextLine();

                Scanner sectionScanner = new Scanner(line);
                sectionScanner.useDelimiter("\"");

                String nameDetails = sectionScanner.next();
                String addressFull = sectionScanner.next();
                String partyDetails = sectionScanner.next();

                String[] nameDetailsParts = nameDetails.split(",");
                String[] addressParts = addressFull.split(",");
                String[] partyDetailsParts = partyDetails.split(",");


                id = nameDetailsParts[nameDetailsParts.length - 3];
                firstName = nameDetailsParts[nameDetailsParts.length - 2];
                surName = nameDetailsParts[nameDetailsParts.length - 1];

                area = partyDetailsParts[partyDetailsParts.length - 1];
                party = partyDetailsParts[partyDetailsParts.length - 2];

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "ElectionStat{" +
                "id='" + id + '\'' +
                ", surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", party='" + party + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    @Override
    public int compareTo(ElectionStat el) {
        return this.area.compareTo(el.area);
    }
}

