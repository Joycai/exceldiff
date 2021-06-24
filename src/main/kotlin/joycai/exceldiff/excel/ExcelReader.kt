package joycai.exceldiff.excel

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.ByteArrayInputStream

class ExcelReader(
    val workbook: Workbook
) {

    fun conv() {
        val rowDataList = readSheet("01")
        for (row in rowDataList){

        }
    }

    fun readSheet(sheetName: String): List<List<Cell>> {
        val sheet = getSheet(sheetName)
        val rowList: MutableList<List<Cell>> = mutableListOf()
        val rowItr = sheet.rowIterator()

        while (rowItr.hasNext()) {
            val row = rowItr.next()
            val cellList = mutableListOf<Cell>()
            val itr = row.cellIterator()
            while (itr.hasNext()) {
                val cell = itr.next()
                cellList.add(cell)
            }
            rowList.add(cellList)
        }
        return rowList
    }

    private fun getSheet(sheetName: String): Sheet {
        var sheet = workbook.getSheet(sheetName)
        if (sheet == null) {
            sheet = workbook.createSheet(sheetName)
        }
        return sheet
    }

    companion object {
        fun readXlsx(file: ByteArray): ExcelReader {
            val workbook: Workbook = XSSFWorkbook(ByteArrayInputStream(file))

            return ExcelReader(workbook)
        }
    }
}