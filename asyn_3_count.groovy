// Select annotations.
selectAnnotations()

// Run cell detection.
setImageType('FLUORESCENCE');
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage": "CHS1",  "requestedPixelSizeMicrons": 0.5,  "backgroundRadiusMicrons": 8.0,  "medianRadiusMicrons": 0.0,  "sigmaMicrons": 1.5,  "minAreaMicrons": 10.0,  "maxAreaMicrons": 400.0,  "threshold": 100.0,  "watershedPostProcess": true,  "cellExpansionMicrons": 25.0,  "includeNuclei": true,  "smoothBoundaries": true,  "makeMeasurements": true}');

// Select annotations (again, just to be sure).
selectAnnotations()

// Run subcellular cell detection.
runPlugin('qupath.imagej.detect.cells.SubcellularDetection', '{"detection[Channel 1]": 550.0,  "doSmoothing": false,  "splitByIntensity": true,  "splitByShape": true,  "spotSizeMicrons": 1.0,  "minSpotSizeMicrons": 0.1,  "maxSpotSizeMicrons": 2.0,  "includeClusters": false}');

