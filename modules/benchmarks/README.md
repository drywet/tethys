
# Parsing: ops/s

name \ size|10|100|1000|10000|100000
---|---|---|---|---|---
tethys-jackson|21801.031|2468.338|246.451|20.202|2.379
pure-jackson|25936.158|2707.511|272.544|23.996|2.796
circe-jawn|13695.326|1599.672|152.555|14.788|0.993
json4s-jackson|4548.517|564.808|50.725|4.887|0.354
json4s-native|5040.585|516.776|44.817|2.889|0.055
play-json|7226.712|774.596|71.921|5.97|0.348
spray-json|11373.492|1170.072|106.751|10.981|0.751

![ParsingPerformance](./images/ParsingPerformance.png)
     
         


# Writing: ops/s

name \ size|10|100|1000|10000|100000
---|---|---|---|---|---
tethys-jackson|66389.133|6757.967|618.965|50.072|4.826
pure-jackson|48536.608|6781.561|623.406|50.949|5.037
circe-jawn|20395.042|2169.751|186.734|17.926|1.612
StringBuilder|48274.971|5423.089|479.946|44.712|4.687
json4s-jackson|5284.643|654.625|60.677|5.994|0.543
json4s-native|12171.635|1305.59|137.036|12.945|1.393
play-json|3401.413|377.737|38.956|3.786|0.328
spray-json|15160.319|1630.685|140.493|13.12|1.151
pushka|14922.97|1647.257|139.142|14.096|1.281

![WritingPerformance](./images/WritingPerformance.png)
     
         