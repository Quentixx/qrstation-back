package qrstation.back.rest;

import org.springframework.data.repository.CrudRepository;
import qrstation.back.database.data.QRCode;

public interface QRCodeRepository extends CrudRepository<QRCode, String> {
}
