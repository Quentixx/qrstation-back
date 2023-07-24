package qrstation.back.data;

import javax.persistence.*;
import java.util.UUID;

/**
 * Represents a QR Code by a UUID associated with an url.
 */
@Entity
public class QRCode {

    @Id
    private final String uuid;

    @Column
    private String redirectURL;

    public QRCode() {
        uuid = UUID.randomUUID().toString();
    }

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
