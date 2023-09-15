package EnumsExample;

public enum State {
    SAO_PAULO("São Paulo", "SP"),
    PARANA("Paraná", "PR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    RIO_GRANDE_DO_SUL("Rio Grande do SUl", "RS");

    private String name;
    private String uf;

    private State(String name, String uf) {
        this.name = name;
        this.uf = uf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNameUpperCase() {
        return name.toUpperCase();
    }
}
