PRINT "-------------------------------------"
PRINT , "Program Dufan"
PRINT "-------------------------------------"
PRINT
PRINT
INPUT "Masukan tinggi anda: ", tinggi

IF tinggi > 150 THEN
    note$ = "Anda bisa memasuki wahana ini."
ELSE
    note$ = "Maaf, anda tidak dapat memasuki wahana ini."
END IF

PRINT
PRINT "Tinggi anda: "; tinggi; ", "; note$;
END

