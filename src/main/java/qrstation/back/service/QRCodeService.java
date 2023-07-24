package qrstation.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qrstation.back.data.QRCode;
import qrstation.back.repo.QRCodeRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Represents the QRCode service data provider.
 */
@Service
public class QRCodeService {

    private final QRCodeRepository qrCodeRepository;

    @Autowired
    public QRCodeService(QRCodeRepository qrCodeRepository) {
        this.qrCodeRepository = qrCodeRepository;
    }

    public void save(QRCode qrCode) {
        qrCodeRepository.save(qrCode);
    }

    public void deleteQRCode(String uuid) {
        qrCodeRepository.deleteById(uuid);
    }

    public QRCode getQRCode(String uuid) {
        return qrCodeRepository.findById(uuid).orElse(null);
    }

    @Transactional
    public List<QRCode> getAllQRCodes() {
        Iterable<QRCode> qrCodesIterable = qrCodeRepository.findAll();
        return StreamSupport.stream(qrCodesIterable.spliterator(), false)
                .collect(Collectors.toList());
    }
}