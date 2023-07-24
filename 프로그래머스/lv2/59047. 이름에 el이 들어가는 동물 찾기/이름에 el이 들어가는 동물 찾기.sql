-- 코드를 입력하세요
SELECT animal_id, name
from animal_ins
where  animal_type = 'Dog' AND LOWER(NAME) LIKE '%el%'
order by name
/*
SELECT 
        ANIMAL_ID
       ,NAME
FROM ANIMAL_INS

WHERE ANIMAL_TYPE='Dog'
AND LOWER(NAME) LIKE '%el%'
ORDER BY NAME*/