package qrstation.back.rest;

import qrstation.back.database.data.QRCode;
import qrstation.back.database.data.QRCodeRequest;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/qrcodes")
public class QRCodeController {

    private final Map<String, QRCode> qrcodes = new HashMap<>();

    @PostMapping
    public QRCode createQRCode(@RequestBody QRCodeRequest request) {
        String uuid = UUID.randomUUID().toString();
        QRCode qrCode = new QRCode(uuid, request.redirectUrl());
        qrcodes.put(uuid, qrCode);
        return qrCode;
    }

    @GetMapping
    public List<QRCode> getAllQRCodes() {
        return new ArrayList<>(qrcodes.values());
    }

    @GetMapping("/{uuid}")
    public QRCode getQRCode(@PathVariable String uuid) {
        return qrcodes.get(uuid);
    }

    @PutMapping("/{uuid}")
    public QRCode updateQRCode(@PathVariable String uuid, @RequestBody QRCodeRequest request) {
        QRCode qrCode = qrcodes.get(uuid);
        if (qrCode != null) {
            qrCode.setRedirectUrl(request.redirectUrl());
        }
        return qrCode;
    }

    @DeleteMapping("/{uuid}")
    public boolean deleteQRCode(@PathVariable String uuid) {
        return qrcodes.remove(uuid) != null;
    }
}
