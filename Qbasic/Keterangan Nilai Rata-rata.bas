PRINT , , "Menentukan Lulus atau Tidaknya Seorang Siswa"
PRINT
PRINT
INPUT "Masukan nilai rata-rata: ", mean

IF mean > 60 THEN
    ket$ = "Siswa dinyatakan lulus."
ELSE
    ket$ = "Siswa dinyatakan tidak lulus."
END IF
CLS

PRINT ket$
END
