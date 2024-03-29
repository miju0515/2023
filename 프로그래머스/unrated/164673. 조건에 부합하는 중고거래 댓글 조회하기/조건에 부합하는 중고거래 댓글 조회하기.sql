-- 코드를 입력하세요
SELECT UGB.TITLE AS TITLE,UGB.BOARD_ID,UGP.REPLY_ID,UGP.WRITER_ID, UGP.CONTENTS,DATE_FORMAT(UGP.CREATED_DATE,"%Y-%m-%d")
FROM USED_GOODS_BOARD UGB
JOIN USED_GOODS_REPLY UGP
ON UGB.BOARD_ID=UGP.BOARD_ID
WHERE UGB.CREATED_DATE LIKE '2022-10-%'
ORDER BY UGP.CREATED_DATE,UGB.TITLE
