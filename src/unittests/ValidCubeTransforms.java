package unittests;

import solver.algorithms.Cube;

public class ValidCubeTransforms {
   public static byte TEST_RESULTS[][] = {
   { // L 
      Cube.UF, Cube.UR, Cube.UB, Cube.BL, Cube.DF, Cube.DR, Cube.DB, Cube.FL, Cube.UL, Cube.FR, Cube.BR, Cube.DL, 
      Cube.UFR, Cube.URB, Cube.BDL, Cube.BLU, Cube.DRF, Cube.FUL, Cube.FLD, Cube.DBR
   },
   { // F 
      Cube.LU, Cube.UR, Cube.UB, Cube.BL, Cube.RF, Cube.DR, Cube.DB, Cube.FL, Cube.FD, Cube.FU, Cube.BR, Cube.DL, 
      Cube.LUB, Cube.URB, Cube.BDL, Cube.LFU, Cube.RUF, Cube.RFD, Cube.FLD, Cube.DBR
   },
   { // R 
      Cube.LU, Cube.FU, Cube.UB, Cube.BL, Cube.RF, Cube.BR, Cube.DB, Cube.FL, Cube.FD, Cube.DR, Cube.UR, Cube.DL, 
      Cube.FRU, Cube.UBL, Cube.BDL, Cube.LFU, Cube.BRD, Cube.RFD, Cube.FLD, Cube.BUR
   },
   { // B 
      Cube.LU, Cube.FU, Cube.RU, Cube.BL, Cube.RF, Cube.BR, Cube.LD, Cube.FL, Cube.FD, Cube.DR, Cube.BD, Cube.BU, 
      Cube.FRU, Cube.RBU, Cube.BLU, Cube.LFU, Cube.BRD, Cube.RFD, Cube.LBD, Cube.LDF
   },
   { // U 
      Cube.FU, Cube.RU, Cube.BL, Cube.LU, Cube.RF, Cube.BR, Cube.LD, Cube.FL, Cube.FD, Cube.DR, Cube.BD, Cube.BU, 
      Cube.RBU, Cube.BLU, Cube.LFU, Cube.FRU, Cube.BRD, Cube.RFD, Cube.LBD, Cube.LDF
   },
   { // D 
      Cube.FU, Cube.RU, Cube.BL, Cube.LU, Cube.FL, Cube.RF, Cube.BR, Cube.LD, Cube.FD, Cube.DR, Cube.BD, Cube.BU, 
      Cube.RBU, Cube.BLU, Cube.LFU, Cube.FRU, Cube.RFD, Cube.LBD, Cube.LDF, Cube.BRD
   },
   { // Li
      Cube.FU, Cube.RU, Cube.BL, Cube.FD, Cube.FL, Cube.RF, Cube.BR, Cube.BU, Cube.LD, Cube.DR, Cube.BD, Cube.LU, 
      Cube.RBU, Cube.BLU, Cube.UFR, Cube.BDL, Cube.RFD, Cube.FLD, Cube.FUL, Cube.BRD
   },
   { // Fi
      Cube.RD, Cube.RU, Cube.BL, Cube.FD, Cube.DL, Cube.RF, Cube.BR, Cube.BU, Cube.UF, Cube.LF, Cube.BD, Cube.LU, 
      Cube.FDR, Cube.BLU, Cube.UFR, Cube.URB, Cube.DFL, Cube.DLB, Cube.FUL, Cube.BRD
   },
   { // Ri
      Cube.RD, Cube.BD, Cube.BL, Cube.FD, Cube.DL, Cube.LF, Cube.BR, Cube.BU, Cube.UF, Cube.RU, Cube.RF, Cube.LU, 
      Cube.UBL, Cube.RDB, Cube.UFR, Cube.URB, Cube.DRF, Cube.DLB, Cube.FUL, Cube.LDF
   },
   { // Bi
      Cube.RD, Cube.BD, Cube.UL, Cube.FD, Cube.DL, Cube.LF, Cube.FR, Cube.BU, Cube.UF, Cube.RU, Cube.LB, Cube.RB, 
      Cube.UBL, Cube.RUF, Cube.ULF, Cube.URB, Cube.DRF, Cube.DLB, Cube.FLD, Cube.DBR
   },
   { // Ui
      Cube.FD, Cube.RD, Cube.BD, Cube.UL, Cube.DL, Cube.LF, Cube.FR, Cube.BU, Cube.UF, Cube.RU, Cube.LB, Cube.RB, 
      Cube.URB, Cube.UBL, Cube.RUF, Cube.ULF, Cube.DRF, Cube.DLB, Cube.FLD, Cube.DBR
   },
   { // Di
      Cube.FD, Cube.RD, Cube.BD, Cube.UL, Cube.LF, Cube.FR, Cube.BU, Cube.DL, Cube.UF, Cube.RU, Cube.LB, Cube.RB, 
      Cube.URB, Cube.UBL, Cube.RUF, Cube.ULF, Cube.DBR, Cube.DRF, Cube.DLB, Cube.FLD
   },
   { // Li
      Cube.FD, Cube.RD, Cube.BD, Cube.UF, Cube.LF, Cube.FR, Cube.BU, Cube.RB, Cube.DL, Cube.RU, Cube.LB, Cube.UL, 
      Cube.URB, Cube.UBL, Cube.FUL, Cube.RFD, Cube.DBR, Cube.BDL, Cube.UFR, Cube.FLD
   },
   { // Fi
      Cube.UR, Cube.RD, Cube.BD, Cube.UF, Cube.LD, Cube.FR, Cube.BU, Cube.RB, Cube.DF, Cube.FL, Cube.LB, Cube.UL, 
      Cube.BRD, Cube.UBL, Cube.FUL, Cube.BUR, Cube.LBD, Cube.FDR, Cube.UFR, Cube.FLD
   },
   { // Ri
      Cube.UR, Cube.LB, Cube.BD, Cube.UF, Cube.LD, Cube.FL, Cube.BU, Cube.RB, Cube.DF, Cube.RD, Cube.FR, Cube.UL, 
      Cube.LUB, Cube.LDF, Cube.FUL, Cube.BUR, Cube.RDB, Cube.FDR, Cube.UFR, Cube.DLB
   },
   { // Bi
      Cube.UR, Cube.LB, Cube.LU, Cube.UF, Cube.LD, Cube.FL, Cube.RF, Cube.RB, Cube.DF, Cube.RD, Cube.DB, Cube.UB, 
      Cube.LUB, Cube.LFU, Cube.FRU, Cube.BUR, Cube.RDB, Cube.FDR, Cube.BDL, Cube.DFL
   },
   { // Ui
      Cube.UF, Cube.UR, Cube.LB, Cube.LU, Cube.LD, Cube.FL, Cube.RF, Cube.RB, Cube.DF, Cube.RD, Cube.DB, Cube.UB, 
      Cube.BUR, Cube.LUB, Cube.LFU, Cube.FRU, Cube.RDB, Cube.FDR, Cube.BDL, Cube.DFL
   },
   { // Di
      Cube.UF, Cube.UR, Cube.LB, Cube.LU, Cube.FL, Cube.RF, Cube.RB, Cube.LD, Cube.DF, Cube.RD, Cube.DB, Cube.UB, 
      Cube.BUR, Cube.LUB, Cube.LFU, Cube.FRU, Cube.DFL, Cube.RDB, Cube.FDR, Cube.BDL
   },
   { // L 
      Cube.UF, Cube.UR, Cube.LB, Cube.UB, Cube.FL, Cube.RF, Cube.RB, Cube.DF, Cube.LU, Cube.RD, Cube.DB, Cube.LD, 
      Cube.BUR, Cube.LUB, Cube.RFD, Cube.FUL, Cube.DFL, Cube.UFR, Cube.DBR, Cube.BDL
   },
   { // F 
      Cube.UL, Cube.UR, Cube.LB, Cube.UB, Cube.DR, Cube.RF, Cube.RB, Cube.DF, Cube.LF, Cube.FU, Cube.DB, Cube.LD, 
      Cube.ULF, Cube.LUB, Cube.RFD, Cube.RUF, Cube.RBU, Cube.FLD, Cube.DBR, Cube.BDL
   },
   { // R 
      Cube.UL, Cube.FU, Cube.LB, Cube.UB, Cube.DR, Cube.DB, Cube.RB, Cube.DF, Cube.LF, Cube.RF, Cube.UR, Cube.LD, 
      Cube.URB, Cube.LFU, Cube.RFD, Cube.RUF, Cube.DLB, Cube.FLD, Cube.DBR, Cube.BLU
   },
   { // B 
      Cube.UL, Cube.FU, Cube.RU, Cube.UB, Cube.DR, Cube.DB, Cube.DL, Cube.DF, Cube.LF, Cube.RF, Cube.BR, Cube.BL, 
      Cube.URB, Cube.UBL, Cube.FUL, Cube.RUF, Cube.DLB, Cube.FLD, Cube.DRF, Cube.BRD
   },
   { // U 
      Cube.FU, Cube.RU, Cube.UB, Cube.UL, Cube.DR, Cube.DB, Cube.DL, Cube.DF, Cube.LF, Cube.RF, Cube.BR, Cube.BL, 
      Cube.UBL, Cube.FUL, Cube.RUF, Cube.URB, Cube.DLB, Cube.FLD, Cube.DRF, Cube.BRD
   },
   { // D 
      Cube.FU, Cube.RU, Cube.UB, Cube.UL, Cube.DF, Cube.DR, Cube.DB, Cube.DL, Cube.LF, Cube.RF, Cube.BR, Cube.BL, 
      Cube.UBL, Cube.FUL, Cube.RUF, Cube.URB, Cube.FLD, Cube.DRF, Cube.BRD, Cube.DLB
   }
};
}
