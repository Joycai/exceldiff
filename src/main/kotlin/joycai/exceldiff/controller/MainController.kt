package joycai.exceldiff.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import joycai.exceldiff.dto.DiffConfig
import joycai.exceldiff.service.ExcelDifferService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.multipart.MultipartFile

@RestController
class MainController(
    val objectMapper: ObjectMapper,
    val excelDifferService: ExcelDifferService
) {

    @PostMapping("diffExcel")
    fun diffExcel(
        file: Array<MultipartFile>,
        @RequestParam cols: String,
        @RequestParam keyCols: String
    ): Any {
        val colsToDiff: Array<String> = objectMapper.readValue(cols)
        val keyColsToDiff: Array<String> = objectMapper.readValue(keyCols)

        return mapOf("msg" to "ok")
    }
}