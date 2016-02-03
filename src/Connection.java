/**
 * Created by denis on 02/02/16.
 */
public class Connection {

    private Integer mcuId;
    private Integer memId;

    public Connection(Integer mcuId, Integer memId) {
        this.mcuId = mcuId;
        this.memId = memId;
    }

    public Integer getMcuId() {
        return mcuId;
    }

    public Integer getMemId() {
        return memId;
    }
}
