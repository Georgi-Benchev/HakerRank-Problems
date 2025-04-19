SELECT s.name
FROM Students s
JOIN Friends fr on fr.id = s.id
JOIN Packages ps on s.id = ps.id
JOIN Packages pfr on fr.friend_id = pfr.id
WHERE ps.salary < pfr.salary
ORDER BY pfr.salary;