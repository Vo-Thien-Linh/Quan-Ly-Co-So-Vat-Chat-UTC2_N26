package model;

public abstract class VatChat {
    protected String id;
    protected String trangThai;

    public VatChat(String id, String trangThai) {
        this.id = id;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        }
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        if (trangThai != null && !trangThai.trim().isEmpty()) {
            this.trangThai = trangThai;
        }
    }

    public abstract void hienThiThongTin();

    @Override
    public String toString() {
        return "VatChat{" +
                "id='" + id + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
