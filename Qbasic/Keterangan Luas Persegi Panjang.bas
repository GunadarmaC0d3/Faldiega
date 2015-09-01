PRINT , , "Keterangan Luas"
PRINT
PRINT
INPUT "Panjang: ", p
INPUT "Lebar: ", l
luas = p * l

IF luas < 100 THEN
    ket$ = "Sempit"
ELSEIF luas < 500 THEN
    ket$ = "Luas"
ELSE
    ket$ = "Sangat Luas"
END IF

PRINT
PRINT "Hasilnya: "; luas; ket$
END


