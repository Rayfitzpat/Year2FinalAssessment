public class ValidationGui {

    public boolean validateString(String name) {
        if (name.length() > 1 && name.length() < 20) {
            if (name.matches("[a-zA-z\\s]*")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean validateHouseNumber(String address) {
        try {
            if (address.length() >= 1 && address.length() <= 3) {
                int address1 = Integer.parseInt(address);
                int minAddress = 1;
                int maxAddress = 999;

                if (address1 < minAddress) {
                    return false;
                } else if (address1 > maxAddress) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }catch(Exception e) {
            return false;
        }
    }

    public boolean validateStringWithNumbers(String name) {
        if (name.length() > 1 && name.length() < 30) {
            return true;
        } else
            return false;
    }

    public boolean validateID(String DPID) {
        if (DPID.length() < 1 || DPID.length() >3) {
            return false;
        } else if (DPID.matches("[0-9\\d]*")) {
            return true;
        }return false;
    }

}
