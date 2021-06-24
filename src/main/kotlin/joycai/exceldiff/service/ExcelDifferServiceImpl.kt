package joycai.exceldiff.service

import joycai.exceldiff.dto.DiffConfig
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.springframework.stereotype.Service
import java.io.ByteArrayInputStream

@Service("ExcelDifferService")
class ExcelDifferServiceImpl : ExcelDifferService {

    override fun doDiff(fileSrc: ByteArray, fileTarget: ByteArray, diffConfig: DiffConfig) {
    }

    protected fun readFile(file: ByteArray): List<Any> {

        return arrayListOf()
    }
}