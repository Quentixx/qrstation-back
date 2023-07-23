package qrstation.back.database.data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Represents a QR Code by a UUID associated with an url.
 */
@DatabaseTable(tableName = "qrcodes")
public class QRCode {

    @DatabaseField(id = true)
    private final String uuid;

    @DatabaseField
    private String redirectURL;

    public QRCode(String uuid, String redirectURL) {
        this.uuid = uuid;
        this.redirectURL = redirectURL;
    }

    public String getUuid() {
        return uuid;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectUrl(String newRedirectURL) {
        redirectURL = newRedirectURL;
    }
}
