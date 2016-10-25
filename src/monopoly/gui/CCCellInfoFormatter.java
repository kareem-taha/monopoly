package monopoly.gui;

import monopoly.Cell;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        return "<html><font color='black'><b>" + cell.getName() + "</b></font></html>";
    }
}
