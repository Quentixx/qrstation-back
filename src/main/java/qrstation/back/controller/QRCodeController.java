package qrstation.back.controller;

import qrstation.back.service.QRCodeService;
import qrstation.back.data.QRCode;
import qrstation.back.data.QRCodeRequest;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * The QRCodeController class is a Spring REST controller that handles HTTP
 * requests related to QR Codes.
 * <p>
 * This class is annotated with @RestController, which combines the @Controller
 * and @ResponseBody annotations. It indicates that this class will handle HTTP
 * requests and directly return the response in the form of JSON or XML (based
 * on content negotiation).
 * <p>
 * The base URL for all requests related to QR Codes is "/qrcodes", as specified
 * by the @RequestMapping annotation on the class level.
 */
@RestController
@RequestMapping("/qrcodes")
public class QRCodeController {

    private final QRCodeService service;

    public QRCodeController(QRCodeService service) {
        this.service = service;
    }

    @PostMapping
    public QRCode createQRCode(@RequestBody QRCodeRequest request) {
        String uuid = UUID.randomUUID().toString();
        QRCode qrCode = new QRCode(uuid, request.redirectUrl());
        service.save(qrCode);
        return qrCode;
    }

    @GetMapping
    public List<QRCode> getAllQRCodes() {
        return service.getAllQRCodes();
    }

    @GetMapping("/{uuid}")
    public QRCode getQRCode(@PathVariable String uuid) {
        return service.getQRCode(uuid);
    }

    @PutMapping("/{uuid}")
    public QRCode updateQRCode(@PathVariable String uuid, @RequestBody QRCodeRequest request) {
        QRCode qrCode = service.getQRCode(uuid);
        if (qrCode != null) {
            qrCode.setRedirectUrl(request.redirectUrl());
        }
        return qrCode;
    }

    @DeleteMapping("/{uuid}")
    public void deleteQRCode(@PathVariable String uuid) {
        service.deleteQRCode(uuid);
    }
}
