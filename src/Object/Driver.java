package Object;

public abstract class Driver {

    final String FIO;

    private boolean LicenseDriver;

    private String seniority;

    public Driver(String FIO, boolean licenseDriver, String seniority) {
        this.FIO = FIO;
        LicenseDriver = licenseDriver;
        this.seniority = seniority;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();

    public String getFIO() {
        return FIO;
    }

    public boolean isLicenseDriver() {
        return LicenseDriver;
    }

    public void setLicenseDriver(boolean licenseDriver) {
        LicenseDriver = licenseDriver;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        if (seniority != null && !seniority.isEmpty() && !seniority.isBlank()){
            this.seniority = seniority;
        }
    }
}
