package joycai.exceldiff.service

import joycai.exceldiff.dto.DiffConfig

interface ExcelDifferService {

    fun doDiff(fileSrc: ByteArray, fileTarget: ByteArray, diffConfig: DiffConfig)

}