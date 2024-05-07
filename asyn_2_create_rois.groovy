import static qupath.lib.gui.scripting.QPEx.*
import qupath.lib.roi.RectangleROI
import qupath.lib.objects.PathAnnotationObject

// Size in pixels at the base resolution.
int x = 190
int y = 160

// Get center pixel.
def viewer = getCurrentViewer()

// Create & add annotation.
cx=1;
cy=1;
for(int i = 0;i<6;i++) {
         def roi = new RectangleROI(cx, cy, x,y)
        def annotation = new PathAnnotationObject(roi)
        addObject(annotation)
        cx=cx+150;
        cy=cy+150;
}
